package am.itspace.newfeaturesinjava8.service;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FileStream {


    private Path path = Paths.get("file.txt");


    public void printFileLines(Path path) throws IOException {

        Stream<String> streamLines = Files.lines(path);
        List<String> lines = streamLines
                .collect(Collectors.toList());
        lines.forEach(System.out::println);

    }

}



