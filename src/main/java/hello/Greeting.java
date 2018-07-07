package hello;

public class Greeting {

    private final long id;
    private final String content;
    private final String version;

    public Greeting(long id, String content, String version) {
        this.id = id;
        this.content = content;
	this.version = version;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public String getVersion() {
	return version;
   }
}
