package templateparttern;

public class ConflictCodeCommit extends GitCommitCodeTemplate{
    boolean pull(String code) {
        if ("abc".equals(code))
        {
            System.out.println("code conflict");
            return false;
        }else{
            System.out.println("code unconflict");
            return true;
        }

    }

    String executeRevert() {
        return "bbb";
    }

}
