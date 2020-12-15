package subway;

import subway.domain.*;

import java.util.Scanner;

public class SubwayProgram {
    public static final String MENU_INT_STATION_MANAGER = "1";
    public static final String MENU_INT_LINE_MANAGER = "2";
    public static final String MENU_INT_SECTION_MANAGER = "3";
    public static final String MENU_INT_PRINT_ALL_LINES_AND_STATIONS = "4";
    private final Scanner scanner;
    private LineManager newLineManager;

    public SubwayProgram(Scanner scanner) {
        this.scanner = scanner;
        newLineManager = new LineManager(scanner);
        newLineManager.initializeLine();
    }

    public void run() {
        MainMenu mainMenu = new MainMenu(scanner);
        do {
            String mainMenuNumber = mainMenu.run();
            selectMainMenu(mainMenuNumber);
        } while (mainMenu.doNext());
    }

    public void selectMainMenu(String mainMenuNumber) {
        if (mainMenuNumber.equals(MENU_INT_STATION_MANAGER)) {
            StationManager newStationManager = new StationManager(scanner);
            newStationManager.run();
        } else if (mainMenuNumber.equals(MENU_INT_LINE_MANAGER)) {
            newLineManager.run();
        } else if (mainMenuNumber.equals(MENU_INT_SECTION_MANAGER)) {
            SectionManager newSectionManager = new SectionManager(scanner);
            newSectionManager.run();
        } else if (mainMenuNumber.equals(MENU_INT_PRINT_ALL_LINES_AND_STATIONS)) {
            for (Line line : LineRepository.lines()) {
                System.out.println(line);
            }
        }
    }
}
