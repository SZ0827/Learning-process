package Java.com;

public class Button {
    private OnClickListener listener;
    public void setOnClickListener(OnClickListener listener)
    {
        this.listener = listener;
    }
    public void clik(){
        if(listener != null)
            listener.onClick();
    }
}
