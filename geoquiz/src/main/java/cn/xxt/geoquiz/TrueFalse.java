package cn.xxt.geoquiz;

/**
 * @Author zhq
 * @Date 2019-11-14-08:56
 * @Description
 * @Email 1457453696@qq.com
 */
public class TrueFalse {

    private int question;

    private boolean trueOrFalse;

    public TrueFalse(int question, boolean trueOrFalse) {
        this.question = question;
        this.trueOrFalse = trueOrFalse;
    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public boolean isTrueOrFalse() {
        return trueOrFalse;
    }

    public void setTrueOrFalse(boolean trueOrFalse) {
        this.trueOrFalse = trueOrFalse;
    }
}
