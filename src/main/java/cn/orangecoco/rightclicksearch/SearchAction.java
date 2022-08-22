package cn.orangecoco.rightclicksearch;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;

public class SearchAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        CaretModel caretModel = editor.getCaretModel();
        String selectedText = caretModel.getCurrentCaret().getSelectedText();
        BrowserUtil.browse("https://www.baidu.com/s?wd=" + selectedText);
    }
}
