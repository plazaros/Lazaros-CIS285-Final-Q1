import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();
}
    public testSelectionSort() {
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort sorted = new SelectionSort();
        sorted.sort(arr);

        assertSame("Wrong Value", Sortedarr[0], arr[0]);
        assertSame("Wrong Value", Sortedarr[1], arr[1]);
        assertSame("Wrong Value", Sortedarr[2], arr[2]);
        assertSame("Wrong Value", Sortedarr[3], arr[3]);
        assertSame("Wrong Value", Sortedarr[4], arr[4]);

    }
    
    public void testNegative(){
        
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
        SelectionSort sorted = new SelectionSort();
        sorted.sort(arr);

        assertSame("Wrong Value", Sortedarr[0], arr[0]);
        assertSame("Wrong Value", Sortedarr[1], arr[1]);
        assertSame("Wrong Value", Sortedarr[2], arr[2]);
        assertSame("Wrong Value", Sortedarr[3], arr[3]);
        assertSame("Wrong Value", Sortedarr[4], arr[4]);
    }
    
    public void testMixed(){
        
       	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = -9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -2;
        Sortedarr[3] = 7;
        Sortedarr[4] = 8;
        
        SelectionSort sorted = new SelectionSort();
        sorted.sort(arr);

        assertSame("Wrong Value", Sortedarr[0], arr[0]);
        assertSame("Wrong Value", Sortedarr[1], arr[1]);
        assertSame("Wrong Value", Sortedarr[2], arr[2]);
        assertSame("Wrong Value", Sortedarr[3], arr[3]);
        assertSame("Wrong Value", Sortedarr[4], arr[4]);
    }
    
}