
--@@@@@@@@@@@@
-- ������ ���� ���� : =
--@@@@@@@@@@@@

-- '�̹���'�� �μ��� �˾Ƴ���
select deptno from emp where ename = '�̹���';
-- ���������� �̿��Ͽ� '�̹���'�� �μ��� �˾Ƴ���
select dname 
from dept
where deptno = (select deptno
              from emp
              where ename='�̹���');
-- ��� �޿����� �� ���� �޿��� �޴� ��� ����ϱ�. 9��
select avg(sal) from emp;
select * from emp where sal > 457.777777777777777777777777777777777778;

-- ���������� �̿��Ͽ� ��� �޿����� �� ���� �޿��� �޴� ��� ����ϱ�
select * from emp where sal > (select avg(sal) from emp);

-- ����. �޿��� 500�� �ʰ��ϴ� ����� ���� �μ��� �ٹ��ϴ� ��� ���ϱ�
-- 1. �޿��� 500�� �ʰ��ϴ� ������ �μ��� 3���� ����
-- 2. �޺μ���ȣ 10, 20, 21�� �Ҽӵ� ������ ���

-- �޿��� 500�� �ʰ��ϴ� ������ �μ���ȣ.
select distinct deptno from emp where sal > 500; --oracle������ distinct�ڿ� deptno�� ����� ��.
select * from emp where deptno in (10, 20, 21); -- �޿��� 500�� �ʰ��ϴ� ���� �̸�.

select dept from deptno where sal > (select distinct deptno from emp where sal <= 500);--�ȵ�.

-- @@@@@@@@@@@@
-- ������ ���� ����
-- @@@@@@@@@@@@


-- -------------------- 
-- ���� �� subquery in ��� ����
-- --------------------
-- ��õ���� �ٹ��ϴ� ������ ����Ͻÿ�. 6��
select * from dept where loc = '��õ';
select * from emp where deptno in (20, 21);

-- ���������� �̿��Ͽ� ��õ���� �ٹ��ϴ� ������ ����Ͻÿ�.
select * from emp where deptno in (select deptno from dept where loc = '��õ');


-- �޿��� 500�� �ʰ��ϴ� ����� ���� �μ�(deptno) �� �ٹ��ϴ� ������ ����Ͻÿ�.
select deptno from emp where sal > 500;
select * from emp where deptno in (10,20,21);

-- ���������� �̿��Ͽ� �޿��� 500�� �ʰ��ϴ� ����� ���� �μ�(deptno) �� �ٹ��ϴ� ������ ����Ͻÿ�.
select * from emp
where deptno in (select distinct deptno from emp where sal > 500);

---------------------- 
-- ���� �� subquery not in ��� ����
----------------------
-- ��õ�� �ٹ����� �ʴ� ������ ����Ͻÿ�.
select * from dept where loc='��õ';
select * from emp where deptno!=20 or deptno!=21;

-- ���������� �̿��Ͽ�  ��õ�� �ٹ����� �ʴ� ������ ����Ͻÿ�.

select * from emp where deptno not in (select deptno from dept where loc='��õ');

select * from emp where deptno not in (20,21);

-- -------------------- 
-- ���� �� subquery ALL ��� ����
-- --------------------
-- deptno=30�� �μ��� �ִ� �޿����� ���� �޿��� �޴� ������ ����Ͻÿ�.
-- ù��° ���. MAX ���
select max(sal) from emp where deptno=30;
select * from emp where sal > 500;
select * from emp where sal > (select max(sal) from emp where deptno=30);

-- �ι�° ���. ALL  ��� == ���� AND �� ���� �ǹ�
select sal from emp where deptno=30;
select * from emp where sal > 250 and sal > 500 and sal > 450 and sal > 480 and sal > 500 and sal > 280;

select * from emp
where sal > all (select sal from emp where deptno=30);

-- -------------------- 
-- ���� �� subquery ANY ��� ����
-- --------------------
-- deptno=30�� �μ��� �ּ� �޿����� ���� �޿��� �޴� ������ ����Ͻÿ�.
-- ù��° ���. MIN ���
select min(sal) from emp where deptno = 30;
select * from emp where sal > 250;
select * from emp where sal > (select min(sal) from emp where deptno = 30);

-- �ι�° ���. ANY ��� == ���� OR �� ���� �ǹ�
select * from emp where sal > 250 or sal > 500 or sal > 450 or sal > 480 or sal > 500 or sal > 280;

select * from emp
where sal > any (select sal from emp where deptno=30);


-- -------------------- 
-- ���� �� subquery exist ��� ����
-- --------------------

-- ���� ������ �ִ� �μ��� ����Ͻÿ�. 5���� ��µǸ� ����.
-- in�� ����ϴ� ���
select distinct deptno from emp;
select deptno from emp group by deptno;
 
select * from dept where deptno in (10, 20, 21, 30, 31);
select * from dept where deptno in (select distinct deptno from emp);
-- exists �� ����ϴ� ���

select * from dept
where exists ( select distinct deptno from emp where emp.deptno = dept.deptno);
 
-- @@@@@@@@@@@@
-- table ���� ���� : from ������ ���Ǵ� ��������
-- join �� ���յ� ����
-- @@@@@@@@@@@@
-- ��õ���� �ٹ��ϴ� ������ ����Ͻÿ�. 6��
-- where�� ���� ������ ����ϴ� ���
select * from emp where deptno in (select deptno from dept where loc = '��õ');
  
-- from�� ���� ������ ����ϴ� ��� 
select *
from emp, (select deptno from dept where loc = '��õ')d
where emp.DEPTNO = d.deptno;


-- @@@@@@@@@@@@
-- scalar ���� ���� : select ������ ���Ǵ� ��������
-- join �� ���յ� ����
-- @@@@@@@@@@@@
-- emp ��½� deptno ��ſ� dept���̺��� dname ���� ��µǵ��� �Ͻÿ�.



-- @@@@@@@@@@@@@@
-- �̼� 05. 
-- @@@@@@@@@@@@@@

-- 1. ���������� �̿��ؼ� �����ο� �ٹ��ϴ� ����� �̸��� �Ի����� ����Ͻÿ�.




-- 2. ������ �ּ� �޿����� ���� �޿��� �޴� �������� 
--    �̸�, �޿� �׸��� ������ ����ϵ�, ������ ������� �ʴ´�.




-- 3. ��õ�� ��ġ�� �μ��� �Ҽӵ� �������� �޿��� 100�� �λ��� ����� ����Ͻÿ�.






-- 4. �μ����� ���� �޿��� ���� �޴� ������ ������ ����Ͻÿ�.


 

-- 5. ����(job)�� ������ �������� ���� �μ� ������ ����Ͻÿ�.



-- 6. ��� �޿����� �� ���� �޿��� �޴� ��� ����ϱ�

-- 7. �̹����� ���� �μ��� �ٹ��ϴ� ����� �̸��� �μ���ȣ�� ����ϴ� SQL�� �ۼ��Ͻÿ�.

-- 8. �̹����� ������ ������ ���� ����� ����Ͻÿ�.

-- 9. �̹����� �޿��� �����ϰų� �� ���� �޴� ��� ��� �޿��� ����Ͻÿ�.

-- 10. ���� ����� ���켺�� ����� �̸��� �޿��� ����Ͻÿ�.
