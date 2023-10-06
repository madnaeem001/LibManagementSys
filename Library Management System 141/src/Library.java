import org.w3c.dom.ls.LSOutput;

public class Library {
    LibraryItem[] libItems = new LibraryItem[100];
    private static int itemCount = 0;

    public void addItem(LibraryItem item){
        libItems[itemCount] = item;
        itemCount ++;
    }

    public void borrowItem(LibraryItem item){
        item.setBorrowed(true);
    }

    public void returnItem(LibraryItem item){
        item.setBorrowed(false);
    }

    public void displayAvailableItems(){
        for(LibraryItem i : libItems){
            if(i != null){
                if(i.isBorrowed() == false){
                    System.out.println(i);
                    System.out.println("\n");
                }
            }
        }
    }

    public void displayBorrowedItems(){
        int count = 0;
        for(LibraryItem i : libItems){
            if(i != null){
                if(i.isBorrowed() == true){
                    System.out.println(i);
                    System.out.println("\n");
                    count ++;
                }
                }
            }
        System.out.println(count +" books have been borrowed");
        }




    }





