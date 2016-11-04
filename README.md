# Extensions

This project demonstrates how to [extend](https://doc.cuba-platform.com/manual-6.3/extension.html) an entity and corresponding screens defined in an application component.

Suppose you have `Department` entity in your project and you want to add an attribute of this type to the standard `User` entity defined in the platform (i.e. in `com.haulmont.cuba` component). The following elements have been created in the project:

- The `ExtUser` entity has `User` in the *Parent class* field and the *Replace parent* checkbox is selected.

- There are two `ExtUser` views with the same names as used for `User` in its browser and editor screens. Please notice that they extend base views and add the `department` attribute.

- The `ext-user-browse.xml` and `ext-user-edit.xml` screens extend the corresponding screens from the platform. They have the same identifiers as base screens.

Based on CUBA Platform 6.3.2