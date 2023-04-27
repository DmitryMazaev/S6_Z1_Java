import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SearchNotebook 
{
    List<Notebook> listNotebooks = new ArrayList<>();

    public SearchNotebook addNotebook (Notebook notebook)
    {
        listNotebooks.add(notebook);
        return this;
    }

    public  List<Notebook> getList()
    {
        return listNotebooks;
    }

    public Notebook findNotebook(String string)
    {
        for (int i = 0; i < getList().size(); i++)
        {
            if (getList().get(i).getOS().equals(string))
            {
                return getList().get(i);
            }
        }
        return null;
    }
}
