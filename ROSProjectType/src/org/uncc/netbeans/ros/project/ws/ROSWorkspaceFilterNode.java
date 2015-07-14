/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uncc.netbeans.ros.project.ws;

import java.awt.Image;
import javax.swing.Action;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.support.NodeFactorySupport;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataFolder;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.FilterNode;
import org.openide.nodes.Node;
import org.openide.util.ImageUtilities;
import org.openide.util.lookup.Lookups;
import org.uncc.netbeans.ros.project.ROSProject;
import org.uncc.netbeans.ros.project.ROSProjectLogicalView;
import org.uncc.netbeans.ros.project.RunCloneGitRepository;
import org.uncc.netbeans.ros.project.RunROSCore;
import org.uncc.netbeans.ros.project.RunRViz;

/**
 *
 * @author arwillis
 */
/**
 * This is the node you actually see inside the project node for the project
 */
public class ROSWorkspaceFilterNode extends FilterNode {

    private static Image smallImage
            = ImageUtilities.loadImage(ROSProject.ICON_RESOURCE); // NOI18N
    public ROSWorkspaceFilterNode(Node node) {
        super(node);
    }

    public ROSWorkspaceFilterNode( Project project) throws DataObjectNotFoundException {
//        super(DataObject.find(project.getProjectDirectory().getFileObject("ros_ws")).getNodeDelegate());
        super(DataObject.find(project.getProjectDirectory()).getNodeDelegate());
    }    
    
    public ROSWorkspaceFilterNode(Node node, Project project) throws DataObjectNotFoundException {
        super(node,
                NodeFactorySupport.createCompositeChildren(project,
                        ROSProjectLogicalView.REGISTERED_NODE_LOCATION),
                null
        );
    }

    @Override
    public Action[] getActions(boolean arg0) {
        Action[] nodeActions = new Action[]{
            //                CommonProjectActions.newFileAction(),
            //                //The 'null' indicates that the default icon will be used:
            //                ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, "Build", null),
            //                ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_REBUILD, "Clean and Build", null),
            //                ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_CLEAN, "Clean", null),
            //                CommonProjectActions.moveProjectAction(),
            //                CommonProjectActions.renameProjectAction(),
            //                CommonProjectActions.copyProjectAction(),
            //                CommonProjectActions.deleteProjectAction(),
            //                CommonProjectActions.setAsMainProjectAction(),
            new RunROSCore(),
            new RunRViz(),
            new RunCloneGitRepository(), //                CommonProjectActions.closeProjectAction(),
        //                CommonProjectActions.setProjectConfigurationAction(),
        //                CommonProjectActions.customizeProjectAction()
        };
        return nodeActions;
    }

//    @Override
//    public Action[] getActions(boolean arg0) {
//        return new Action[]{ //            CommonProjectActions.newFileAction(),
//        //            CommonProjectActions.copyProjectAction(),
//        //            CommonProjectActions.deleteProjectAction(),
//        //            CommonProjectActions.closeProjectAction()
//        };
//    }
    @Override
    public String getDisplayName() {
        return "workspace";
    }

    //Next, we add icons, for the default state, which is
    //closed, and the opened state; we will make them the same.
    //Icons in project logical views are
    //based on combinations--you must combine the node's own icon
    //with a distinguishing badge that is merged with it. Here we
    //first obtain the icon from a data folder, then we add our
    //badge to it by merging it via a NetBeans API utility method:
    @Override
    public Image getIcon(int type) {
        DataFolder root = DataFolder.findFolder(FileUtil.getConfigRoot());
        Image original = root.getNodeDelegate().getIcon(type);
        return ImageUtilities.mergeImages(original, smallImage, 7, 7);
    }

    @Override
    public Image getOpenedIcon(int type) {
        DataFolder root = DataFolder.findFolder(FileUtil.getConfigRoot());
        Image original = root.getNodeDelegate().getIcon(type);
        return ImageUtilities.mergeImages(original, smallImage, 7, 7);
    }
}
