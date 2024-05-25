package repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.exception.FileNotFoundException;


class FileHandlerRepositoryImplTest {

    @Test
    void readFile() {
        FileHandlerRepositoryImpl fileHandlerRepository = new FileHandlerRepositoryImpl();
       Assertions.assertThatThrownBy(fileHandlerRepository::readFile)
               .isInstanceOf(FileNotFoundException.class);

    }
}