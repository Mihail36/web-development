PROGRAM HelloSomebody(INPUT, OUTPUT);
USES
  Dos;
VAR
  Querry, Name: STRING;
BEGIN {HelloSomebody}
  WRITELN('Content-Type: text/plain');
  WRITELN;
  Querry:= GetEnv('QUERY_STRING');
  Name:= Copy(Querry, 6, Length(Querry));
  IF Name = ''
  THEN
    WRITELN('Hello, Anonymous')
  ELSE
    WRITELN('Hello dear, ', Name)
END. {HelloSomebody}
