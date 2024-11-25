package Week6.Assignment1.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import Week6.Assignment1.model.Note;
import Week6.Assignment1.model.Notebook;

public class NoteController {
    @FXML
    private TextField titleField;
    @FXML
    private TextArea contentArea;
    @FXML
    private Button addButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button deleteButton;
    @FXML
    private ListView<Note> notesListView;

    private Notebook notebook;
    private ObservableList<Note> notesObservableList;
    private Note selectedNote;

    public NoteController() {
        this.notebook = new Notebook();
        this.notesObservableList = FXCollections.observableArrayList(notebook.getNotes());
    }

    @FXML
    private void initialize() {
        addButton.setOnAction(event -> addNote());
        updateButton.setOnAction(event -> updateNote());
        deleteButton.setOnAction(event -> deleteNote());
        notesListView.setItems(notesObservableList);
        notesListView.setOnMouseClicked(this::handleNoteSelection);
    }

    private void addNote() {
        String title = titleField.getText();
        String content = contentArea.getText();
        if (!title.isEmpty() && !content.isEmpty()) {
            Note note = new Note(title, content);
            notebook.addNote(note);
            notesObservableList.setAll(notebook.getNotes());
            titleField.clear();
            contentArea.clear();
        }
    }

    private void updateNote() {
        if (selectedNote != null) {
            selectedNote.setTitle(titleField.getText());
            selectedNote.setContent(contentArea.getText());
            notesObservableList.setAll(notebook.getNotes());
            clearSelection();
        }
    }

    private void deleteNote() {
        if (selectedNote != null) {
            notebook.getNotes().remove(selectedNote);
            notesObservableList.setAll(notebook.getNotes());
            clearSelection();
        }
    }

    private void handleNoteSelection(MouseEvent event) {
        selectedNote = notesListView.getSelectionModel().getSelectedItem();
        if (selectedNote != null) {
            titleField.setText(selectedNote.getTitle());
            contentArea.setText(selectedNote.getContent());
            addButton.setVisible(false);
            updateButton.setVisible(true);
            deleteButton.setVisible(true);
        }
    }

    private void clearSelection() {
        selectedNote = null;
        titleField.clear();
        contentArea.clear();
        addButton.setVisible(true);
        updateButton.setVisible(false);
        deleteButton.setVisible(false);
    }
}