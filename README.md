# Extensions

This project demonstrates how to [extend](https://doc.cuba-platform.com/manual-6.3/extension.html) an entity and corresponding screens defined in an application component.

Suppose you have `Department` entity in your project and you want to add an attribute of this type to the standard `User` entity defined in the platform (i.e. in `com.haulmont.cuba` component). Please look at the following project items:

- If you open the `ExtUser` entity in Studio, you can see that it has `User` in the *Parent class* field and the *Replace parent* checkbox is selected.

- There are two `ExtUser` views with the same names as used for `User` in its browser and editor screens. Please notice that they extend base views and add the `department` attribute.

- The `ext-user-browse.xml` and `ext-user-edit.xml` screens extend the corresponding screens from the platform. They have the same identifiers as base screens.

- The message pack of the new screens includes the message packs of base screens. See `com/company/sample/web/extuser/messages.properties`.

Based on CUBA Platform 6.5.4
