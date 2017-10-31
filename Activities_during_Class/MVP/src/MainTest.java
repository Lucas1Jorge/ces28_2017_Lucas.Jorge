import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;

import bydavy.mvc.controller.PersonDetailControllerImpl;
import bydavy.mvc.model.Person;
import bydavy.mvc.view.PersonDetailView;

public class MainTest {
	PersonDetailView _view;
	Person _person;
	PersonDetailControllerImpl _controller;
	
	@Before
	public void setUp() {
		_person = mock(Person.class);
		_view = mock(PersonDetailView.class);
		when(_view.getNameFromTextField()).thenReturn("Lollita");
	}
	
	@Test
	public void test() {
		_controller = new PersonDetailControllerImpl(_person, _view);
		_controller.changedButtonPressed();
		verify(_person).setName("Lollita");
	}
}
