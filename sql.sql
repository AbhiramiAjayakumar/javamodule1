create procedure 'one_emp_sal'(inout p_temp int)
begin
select sal into p_temp from emp;
DBMS_OUTPUT.PUT_LINE('Hello');
where empno=p_temp;
end



set@p_temp =7839;
call test.one_emp_sal(@p_temp);
select @p_temp;