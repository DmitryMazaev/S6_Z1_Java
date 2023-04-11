import java.util.HashSet;

public class Main 
{
    public static void main (String[] args)
    {
        Notebook notebook = new Notebook(8, 1024, "Win10", 30000);
        Notebook notebook2 = new Notebook(6, 512, "Win8", 20000);
        Notebook notebook3 = new Notebook(6, 512, "Win8", 20000);
        HashSet<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(notebook);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);
        System.out.println(notebookSet);
    }
}
