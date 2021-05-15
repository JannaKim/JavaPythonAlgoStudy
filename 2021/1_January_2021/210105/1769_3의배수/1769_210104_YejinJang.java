import java.io.*;

public class BOJ_1769 {
    static int sum;
    static int ans;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = Integer.parseInt(br.readLine());
        recursive(i);
        bw.write(cnt);
        if(ans%3==0) bw.write("YES");
        else bw.write("NO");
        bw.close();
    }

    public static int sum(int n){
        while(n!=0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    
    public static void recursive(int n){
        if(n<10) return;
        ans = sum(n);
        cnt++;
        recursive(ans);
    }
}
