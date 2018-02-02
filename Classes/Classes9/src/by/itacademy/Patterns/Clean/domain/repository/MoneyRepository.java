package by.itacademy.Patterns.Clean.domain.repository;

import by.itacademy.Patterns.Clean.domain.entity.Money;

public interface MoneyRepository {

   Money get();
   void  save(Money money);
}
