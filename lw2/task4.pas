PROGRAM GetParameter(INPUT, OUTPUT);
USES
  Dos;
FUNCTION GetQueryStringParameter(Key: STRING): STRING;
VAR
  PosParameter, PosDivider: INTEGER;
  Querry, Parameter: STRING;
BEGIN{GetQueryStringParameter}
  Querry:= GetEnv('QUERY_STRING');
  PosParameter:= Pos(Key + '=', Querry);
  IF PosParameter <> 0
  THEN
    BEGIN
      Parameter:= Copy(Querry, PosParameter+Length(Key)+1, Length(Querry));
      PosDivider:= Pos('&', Parameter);
    END
  ELSE
    WRITE('You didn''t write this parameter');
  IF PosDivider <> 0 
  THEN
    Parameter:= Copy(Parameter, 1, PosDivider-1);
  GetQueryStringParameter:= Parameter;
  IF GetQueryStringParameter = ''
  THEN
    WRITE('You didn''t write this parameter')
END;{GetQueryStringParameter}

BEGIN {GetParameter}
  WRITELN('Content-Type: text/plain');
  WRITELN;
  WRITELN('Your First Name: ', GetQueryStringParameter('first_name'));
  WRITELN('Your Last Name: ', GetQueryStringParameter('last_name'));
  WRITELN('Your Age: ', GetQueryStringParameter('age'))
END. {GetParameter}
