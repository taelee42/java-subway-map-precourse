package subway;

import subway.domain.*;

import java.util.Scanner;
import java.util.List;

public class SubwayProgram {
    private final Scanner scanner;
    private StationRepository newStationRepository;
    private LineRepository newLineRepository;

    public SubwayProgram(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        MainMenu mainMenu = new MainMenu(scanner);
        int mainMenuNumber = mainMenu.inputAndNext();
        newStationRepository = new StationRepository();
//        System.out.println(StationRepository.stations().get(0).getName());
    }



}
