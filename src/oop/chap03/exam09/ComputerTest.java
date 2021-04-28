package oop.chap03.exam09;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        NoteBook myNote = new MyNoteBook();
        myNote.typing();
        myNote.turnOn();
        myNote.turnOff();
    }

}
