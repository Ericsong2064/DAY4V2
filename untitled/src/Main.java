import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num=0;
        ArrayList<String> fileData = getFileData("src/file");
        System.out.println(fileData.size());
        String[][]XMAS=new String[fileData.size()][fileData.get(0).length()];
        System.out.println(fileData);
        for(int i = 0; i<XMAS.length;i++){
            for(int e=0; e<XMAS[i].length;e++){
                XMAS[i][e]=fileData.get(i).substring(e,e+1);
                System.out.print(XMAS[i][e]+ " ");
            }
            System.out.println();
        }
        for(int i = 0; i<XMAS.length;i++){
            for(int e=0; e<fileData.get(0).length()-3;e++){
                if(XMAS[i][e].equals("X")&&XMAS[i][e+1].equals("M")&&XMAS[i][e+2].equals("A")&&XMAS[i][e+3].equals("S")){
                    num++;
                }
            }
        }
        for(int i = 0; i<XMAS.length;i++){
            for(int e=fileData.get(0).length()-1; e>2;e--){
                if(XMAS[i][e].equals("X")&&XMAS[i][e-1].equals("M")&&XMAS[i][e-2].equals("A")&&XMAS[i][e-3].equals("S")){
                    num++;
                }
            }
        }
        for(int i = 0; i<fileData.get(0).length();i++){
            for(int e=0; e<XMAS.length-3;e++){
                if(XMAS[e][i].equals("X")&&XMAS[e+1][i].equals("M")&&XMAS[e+2][i].equals("A")&&XMAS[e+3][i].equals("S")){
                    num++;
                }
            }
        }
        for(int i = 0; i<fileData.get(0).length();i++){
            for(int e=XMAS.length-1; e>2;e--){
                if(XMAS[e][i].equals("X")&&XMAS[e-1][i].equals("M")&&XMAS[e-2][i].equals("A")&&XMAS[e-3][i].equals("S")){
                    num++;
                }
            }
        }
        for(int i = 0; i<XMAS.length-3;i++){
            for(int e=0; e<fileData.get(0).length()-3;e++){
                if(XMAS[i][e].equals("X")&&XMAS[i+1][e+1].equals("M")&&XMAS[i+2][e+2].equals("A")&&XMAS[i+3][e+3].equals("S")){
                    num++;
                }
            }
        }
        for(int i = XMAS.length-1; i>2;i--){
            for(int e=fileData.get(0).length()-1; e>2;e--){
                if(XMAS[i][e].equals("X")&&XMAS[i-1][e-1].equals("M")&&XMAS[i-2][e-2].equals("A")&&XMAS[i-3][e-3].equals("S")){
                    num++;
                }
            }
        }
        for(int i = 0; i<fileData.get(0).length()-3;i++){
            for(int e=3; e<XMAS.length;e++){
                if(XMAS[e][i].equals("X")&&XMAS[e-1][i+1].equals("M")&&XMAS[e-2][i+2].equals("A")&&XMAS[e-3][i+3].equals("S")){
                    num++;
                }
            }
        }
        for(int i = 3; i<XMAS.length-3;i++){
            for(int e=0; e<fileData.get(0).length();e++){
                if(XMAS[i][e].equals("X")&&XMAS[i+1][e-1].equals("M")&&XMAS[i+2][e-2].equals("A")&&XMAS[i+3][e-3].equals("S")){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}