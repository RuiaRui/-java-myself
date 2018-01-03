

public class VHSMovie extends Movie implements VHS {
    private String format;
    private String language;

    public VHSMovie(String initialTitle, String[] initialActors, String initialDirector,
                    String initialFormat,String initialLanguage) {
        super(initialTitle, initialActors, initialDirector);
        format=initialFormat;
        language=initialLanguage;
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return getTitle()+","+format+","+language;

    }
}
