Three kinds of errors can occur in a program : 
1. Compile-time errors,
2. Runtime errors,
3. Login Errors 

Compile time errors occur when we violate the rules of the Java language. For example, parentheses and braces have to come in matching pairs. So (1+2) is legal, but 8) is not. In the latter case, the programm cannot be compiled, and the compiler displays a **syntax error**. Error messages from the compiler usually indicate where in the program the error occured. Sometimes they tell us exactly where or what the error is.

A Runtime error is so-called because it does not appear until after the program has started running. In Java, these errors occur while the interpreter is executing byte code and something goes wrong. These errors are also called **Exceptions** because they usually indicate that something unexpected happened. 
When a run-time error occurs, a program terminates/crashes and displays an error message that explains what happened and where. 

Logic errors cannot appear in compile or runtime errors. The program will compile and run but it will not do what it is told to do. Identifying logic errors can be hard because we have to work backward, looking at the output of the program, trying to figure out why it is doing the wrong thing, and how to make it do the right thing. Usuallym