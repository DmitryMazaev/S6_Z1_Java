

public class Main 
{
    public static void main (String[] args)
    {
        SearchNotebook searchNotebook = new SearchNotebook();
        searchNotebook.addNotebook(new Notebook(8, 1024, "Win10", 30000))
                        .addNotebook(new Notebook(6, 1024, "Win8", 20000))
                        .addNotebook(new Notebook(8, 2048, "Win10", 25000))
                        .addNotebook(new Notebook(16, 2048, "Win10", 40000));

        for (int i = 0; i < searchNotebook.getList().size(); i++)
        {
            System.out.println(searchNotebook.getList().get(i));
        }

        Notebook found = searchNotebook.findNotebook("Win8");
        System.out.println("Ноутбук по данным поиска: " + found);

    }
}
