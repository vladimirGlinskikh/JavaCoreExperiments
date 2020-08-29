package designPatterns.structural.facade.videoConverter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubeVideo.ogg", "mp4");
    }
}
