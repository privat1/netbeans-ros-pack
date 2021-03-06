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

import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.uncc.netbeans.ros.project.TerminalDriverAction;

@ActionID(
        category = "Project",
        id = "org.uncc.netbeans.ros.project.RunGetGitRepository"
)
@ActionReference(path = "Projects/Actions")
public class RunGetGitRepository extends TerminalDriverAction {

    public RunGetGitRepository() {
        String[] cmds = {"source /opt/ros/indigo/setup.bash\n",
            "cd ros_ws/src\n",
//            "echo \"y\" | wstool set ros_control --git \n",
            "wstool update\n",
            "exit"};
//        this.commandList = cmds;
//        this.actionName = "Get Git Repo";
    }
}
