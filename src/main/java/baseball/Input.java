package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public static void startGameMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static Integer askWhatToDo() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        if (input.equals("1")) {
            return 1;
        }
        if (input.equals("2")) {
            return 2;
        }
        throw new IllegalArgumentException("1,2 이외의 입력 : 잘못된 입력입니다");
    }
}
