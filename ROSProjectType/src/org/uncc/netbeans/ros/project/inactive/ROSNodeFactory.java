/* 
 * Copyright (C) 2015 Andrew Willis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.uncc.netbeans.ros.project.inactive;

import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactory;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.netbeans.spi.project.ui.support.NodeList;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;
import org.uncc.netbeans.ros.project.ProjectChildrenFactory;
import org.uncc.netbeans.ros.project.ROSProject;

/**
 *
 * @author arwillis
 */
@NodeFactory.Registration(projectType = ROSProject.TYPE, position = 200)
public class ROSNodeFactory implements NodeFactory {

    Project proj;
    ProjectChildrenFactory childrenFactory;  
    public ROSNodeFactory() {
    }

    @SuppressWarnings("unchecked")
    @Override
    public NodeList<?> createNodes(Project project) {
        ROSProject p = project.getLookup().lookup(ROSProject.class);
        assert p != null;
        FilterFileNodesList fn = new FilterFileNodesList(p) {
//        return new FilterFileNodesList(p) {
            @Override
            public boolean checkAddOK(FileObject folderFile) {
                if (folderFile.getName().equals("nbproject")) {
                    // do nothing -- do not add to view
                    return false;
//                } else if (folderFile.getName().equals(ROSProject.ROS_WORKSPACE_FOLDER)) {
                    // do nothing -- do not add to view
                    // this node is expanded by the workspace project provider
                    //
//                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Node createNode(FileObject fobj, Node fobjNode) {
                return fobjNode;
            }
        };
        Node[] n1;
        n1 = fn.keys().toArray(new Node[0]);
//        try {
//               create default node for all elements
//            AbstractNode nd = new AbstractNode(Children.LEAF);
//            ROSWorkspaceFilterNode nd = new ROSWorkspaceFilterNode(project);
//            Node[] n2 = new Node[n1.length+1];
//            int i=0;
//            while(i < n1.length) {
//                n2[i] = n1[i];
//                i++;
//            }
//            n2[i]=nd;
//            return NodeFactorySupport.fixedNodeList(n2);
//        } catch (DataObjectNotFoundException ex) {
//            Exceptions.printStackTrace(ex);
//        }
//        return NodeFactorySupport.fixedNodeList(n1);
        return NodeFactorySupport.fixedNodeList();
    }
}
