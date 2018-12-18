//package JavaWeek4.Exercise10;
//
//import JavaWeek4.Exercise7.Topic;
//import JavaWeek4.Exercise9.FileReader;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TopicReader {
//    private FileReader fileReader = new FileReader();
//
//    public List<Topic> getTopics(String filePath) {
//        List<Topic> topics = new ArrayList<>();
//        List<String> lines = fileReader.asLines("JavaWeek4/Exercise10/TOPIC");
//        for (String line : lines) {
//            Topic topic = new Topic(line);
//            topics.add(topic);
//
//
//        }
//        return topics;
//
//
//    }
//
//}
