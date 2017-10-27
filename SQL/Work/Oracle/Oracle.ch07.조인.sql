
-- ########################
-- ������ 2�� �̻��� ���̺��� ������ ��
-- 
-- 
-- ########################

 
 -- emp ���̺� p ��� ��Ī �ο��Ͻÿ�.
 select * from emp ;
 select emp.* from emp ;
 
 select * from emp p;
 select p.* from emp p;
 
 
 -- emp ���̺� p ��� ��Ī �ο��ϰ� ename�� �̸�����, job �� �������� ����Ͻÿ�.
select ename �̸�, job ���� from emp p;

-- emp ���̺��� �̸�(enam)�� '�̹���'�� ����� ����Ͻÿ�.

-- dept ���̺��� deptno �� 10 �� �μ��� ����Ͻÿ�.


-- @@@@ 
--  join �� �ʿ��� ����
-- @@@@ 
-- ���������� �̿��ؼ� '�̹���'�� �����Ϳ� �μ����� �Բ� ����Ͻÿ�.
select dname from dept; -- dname�� �μ���.
select *
    --  ,(select dname from dept where deptno = emp.deptno)
    --  ,(select dname from dept where deptno = emp.deptno)
from emp
where ename = '�̹���';-- �ȵ�. ���� ���������� �´��� Ȯ��.


-- ���������� �̿��ؼ� '�̹���'�� ������ �μ��� �׸��� ��ġ�� ����Ͻÿ�.
select * from emp inner join dept
          on  emp.deptno = dept.deptno
          where ename = '�̹���'

select * from emp 
where dept = (select deptno from emp where ename='�̹���');

select a.*
    , (select dname from dept where deptno = a.deptno)
    , (select loc   from dept where deptno = a.deptno)
from emp a
where a.ename = '�̹���'; --ŷ���� �ҽ�
-- ���������� �̿��ؼ� ���� �÷��� ǥ���� �� ���� �߻���.
-- �̷� ��쿡�� ������ �̿��Ͽ� ���� �ذ��� �����Ѵ�.


-- ������ �̿��ؼ� '�̹���'�� ������ �μ��� �׸��� ��ġ�� ����Ͻÿ�.



-- @@@@@@@ 
-- inner join 
-- emp �� dept ���̺� inner join �ϱ�
-- @@@@@@@ 
select * from emp;
-- ���� ����(emp)�� �Ҽӵ� �μ���(dept.dname)�� ����Ͻÿ�.
select emp.* , dept.dname from emp join dept
    on emp.deptno = dept.deptno; -- ���� ���â���� deptno������ emp���� dname�� dept
  
-- ���� SQL�� �����Ͻÿ�. 
-- dept ���̺� d��� ��Ī��, emp ���̺��� e��� ��Ī�� �ο��ϵ��� �����Ͻÿ�.

select e.*, d.dname
  from emp e join dept d on e.deptno = d.deptno;

-- @@@@@@@ 
-- equi join 
-- @@@@@@@ 
  
-- Equi Join�� �̿��Ͽ� ������ ��� ����(emp)�� �Ҽӵ� �μ���(dept.dname)���� ����Ͻÿ�.
-- dept --> d , emp-->e  ���̺� ��Ī�� �ο��ϵ��� �Ѵ�.  
select e.*m d.dname
from dept d, emp e
where d.deptno = e.deptno;--�ȵ�
  
-- ���� SQL���� ���̺� ��Ī�� �ο��ϵ��� �����Ͻÿ�. 
-- dept --> d , emp-->e .


-- @@@@@@@ 
-- left join
-- @@@@@@@ 

-- dept ���̺��� �������� emp ���̺��� �����͸� ��ġ�ÿ�.
select * from dept left join emp
    on dept.deptno = emp.deptno

-- dept - emp �� �������� ���Ͻÿ�. 3���� ���
select * from dept left join emp
    on dept.deptno = emp.deptno
    where emp.empno is null;


-- @@@@@@@ 
-- right join 
-- @@@@@@@    

-- emp ���̺��� �������� dept ���̺��� �����͸� ��ġ�ÿ�.
select * from emp left join dept
			on emp. deptno = dept.deptno; -- �����Ŷ� �Ȱ����� emp�� ���� �ϸ��. ���� ���̺��� ����.



-- ----------
-- auth(�θ����̺�), book(�ڽ����̺�) ���̺��� left join ���ϱ�
-- ----------

-- left join �ϱ� : auth ���̺��� �������� book ���̺��� �����͸� ��ġ�ÿ�.
-- auth - book �� ������ 




-- ----------
-- auth(�θ����̺�), book(�ڽ����̺�) ���̺��� right join ���ϱ�
-- ----------

-- right join : book ���̺��� �������� auth ���̺��� �����͸� ��ġ�ÿ�.
-- book - auth �� ������ 


   
-- ----------
-- full join = left join union right join
-- auth(�θ����̺�), book(�ڽ����̺�) ���̺��� full join �ϱ�
-- oracle�� full join�� ������.
-- mysql�� full join�� �������� ����.
-- ----------



-- @@@@@@@ 
-- cross join
--    on ���� ����
-- @@@@@@@ 





-- @@@@@@@ 
-- self join :  �ڽſ��� �ڱ⸦ ������ �ϴ� ���
-- @@@@@@@ 

select ename, empno �����ȣ, mgr �Ŵ�����ȣ from emp;
-- inner join�� �̿��Ͽ� ��� �Ŵ��� ã��. emp.mgr
select ����.ename, ����.empno, ����.mgr, �Ŵ���.ename, �Ŵ���.empno
from emp ���� inner join emp �Ŵ���
on ����.mgr = �Ŵ���.empno;

-- equi join�� �̿��Ͽ� ��� �Ŵ��� ã��
select ����.ename, ����.empno, ����.mgr, �Ŵ���.ename, �Ŵ���.empno
from emp ����, emp �Ŵ���
where ����.mgr = �Ŵ���.empno;
       
       
-- @@@@@@@@@@
-- �̼� 06. 
-- @@@@@@@@@@
-- 1. �渮�μ��� �ٹ��ϴ� ����� �̸��� �Ի����� ����Ͻÿ�. 3��. ��������
-- 1-1 dept���̺��� '�渮��' ã��
-- 1-2 1-1

-- 1.1 �������� ���
select * from dept where dname = '�渮��';
select enmae, hiredate, from emp where deptno = 10;

select ename, hiredate
from emp
where deptno = (select deptno from dept where dname = '�渮��');

--1.2 join ���
select emp.ename, emp.hiredate
from emp inner join dept on emp.deptno = dept.deptno
where dname = '�渮��'

-- 2. ��õ���� �ٹ��ϴ� ������(ename), �Ի���(hiredate), �޿�(sal) �׸��� �μ���(dname)�� ����ϴ� SQL���� �ۼ��Ͻÿ�. 3��. ����
select * from dept where loc = '��õ'

--2.1 �������� ���
select deptno from dept where loc='��õ'
select ename, hiredate, sal, (select dname from dept where dept.deptno = emp.deptno)
from emp
where deptno in (select deptno from dept where loc = '��õ')

select * from emp;
-- 2.2 join ���
select emp.ename, emp.hiredate, emp.sal, dept.dname
from emp inner join dept on emp.deptno=dept.deptno
where dept.loc = '��õ';

-- 3. ��õ���� �ٹ��ϴ� ������ ���� ����Ͻÿ�. 6��
-- 3.1 �������� ���
select deptno from dept where loc='��õ';
select count(*) from emp where deptno in (20,21);

select count(*) from emp where deptno in(select deptno from dept where loc='��õ');

--3.2 join ���
select count(*)
from emp inner join dept on emp.deptno = dept.DEPTNO
where dept.loc = '��õ';


-- 4. ����(emp.job)�� ������ ������ �̸�(emp.ename), �μ���(dept.dname)�� ����Ͻÿ�. 3��


-- 5. ���� ����� "���켺"�� �������� �̸�(ename),����(job)�� ����Ͻÿ�. 6��




-- 6. "���켺"�� ���� �ٹ������� ���ϴ� ������ '���'�� ������ ����Ͻÿ�.4��



-- 7. '�̹���'�� ������ ������ ���� ����� ����Ͻÿ�. 4��




-- 8. �μ����� ���� �޿��� ���� �޴� ����� 
--    �����ȣ, ����̸�, �޿�, �μ���ȣ, �μ��� ����Ͻÿ�. 8��

-- 8.1 �������� ���



-- 8.2 join ���




-- 9. ����(job) ������ ���� �ִ� �μ��� �μ���ȣ�� �μ���, ��ġ 
--    �׸��� �� �μ��� ���� ������� ������ ����Ͻÿ�. 9��



-- 10. ���庸�� ���� �޿�(���� ���� ����)�� �޴� �������� �̸�, �μ���, ����, �޿��� ����ϵ�
--     ������ ������� ���ÿ�. 5�� or 7��


-- 11. �μ����� ���庸�� ���� �޿�(���� ���� ����)�� �޴� ���� �μ��� �ٹ��ϴ� 
--     �������� �̸�, �μ���, ����, �޿��� ����ϵ� ������ ������� ���ÿ�. 1��

