package iterator.data;

import iterator.iterators.ProfileIterator;
// различные итераторы по нашим файлам-папкам-сайтам-хоть телефонным книгам в телефоне
public interface DataStorage {
    ProfileIterator makeFriendsIterator (String profilePhoneNumber);
    ProfileIterator makeEmployeeIterator (String profilePhoneNumber);
}
