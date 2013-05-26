package org.hunmr.acejump;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.hunmr.acejump.command.CommandAroundJumpFactory;

public class AceJumpAndReplaceWordAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        AceJumpAction.getInstance().addCommandsAroundJumpKey(CommandAroundJumpFactory.REPLACE_WORD_AFTER_JUMP);
        AceJumpAction.getInstance().performAction(e);
    }
}
