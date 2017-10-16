-- @@@@@@@@@@@@@@
-- �׷� �Լ�
-- sum : �հ�
-- avg : ���
-- count : ����
-- min : �ּҰ�
-- max : �ִ밪
-- @@@@@@@@@@@@@@

-- emp ���̺��� ��ü �������� ����Ͻÿ�
select * from emp where job!='���'; -- ��� ���� ���

-- emp ���̺��� ��ü ������ �޿��Ѿ�(sum), �޿����(avg), �ִ�޿�(max), �ּұ޿�(min) ���ϱ�
select sum( sal ), avg( sal ), max( sal ), min( sal ) from emp;

-- emp ���̺��� �� ������ ������? 18��
select count(*) from emp;

-- emp ���̺��� ename �ߺ� ������ ������ ���Ͻÿ�. 17��. count + distinct ���� ����.
select count(distinct ename)
from emp;
select distinct count(ename)
from emp;

-- emp ���̺��� �������� Ŀ�̼�(comm) �Ѿ� ���ϱ�
select comm 
from emp
where comm is not null; -- Ŀ�̼� �޴� ������ ��
select sum(comm) 
from emp;

-- emp ���̺��� Ŀ�̼�(comm)�� �޴� ������ ���� ���ϱ�. 3��
select comm 
from emp
where comm is not null;

-- emp ���̺��� ��ü ������ ���� Ŀ�̼�(comm)�� �޴� ������ ���� ���Ͻÿ�.
select count(*), count(comm) from emp;
select count(*) as ��ü������, count(comm) as Ŀ�̼������� from emp;

-- @@@@@@@@@@@@@@
-- group by ��
-- ������ �κ� �հ� ���ϱ�� ����.
-- 1. �����͸� �׷����� �� ��� 
-- 2. �׷� �Լ��� ����� �� ���
-- 3. GROUP BY ���� ��õ� �÷��� SELECT ���� ����� �� �ִ�.
-- @@@@@@@@@@@@@@

-- -----------------------------------
-- a. emp ���̺��� ��ü �����߿��� �ִ�޿�(sal)�� �ּұ޿�(sal)�� ����Ͻÿ�
-- -----------------------------------
select min(sal), max(sal) from emp;

-- -----------------------------------
-- b. emp ���̺��� deptno�� 10�� ������ �ִ�޿��� �ּұ޿� ����Ͻÿ�.
-- -----------------------------------
select min(sal), max(sal) from emp where deptno=10;

-- -----------------------------------
-- c. emp ���̺��� �μ��� �ִ�޿�, �ּұ޿� ���ϱ�
-- -----------------------------------
select distinct deptno from emp order by deptno asc;--����?
select deptno, min(sal), max(sal) from emp group by deptno;

-- c.1 union�� �̿��ϴ� ���
-- deptno = 10 �� �����߿��� �޿�(sal)�� �ִ�޿�, �ּұ޿��� ���Ͻÿ�
-- deptno = 20 �� �����߿��� �޿�(sal)�� �ִ�޿�, �ּұ޿��� ���Ͻÿ�
-- deptno = 21 �� �����߿��� �޿�(sal)�� �ִ�޿�, �ּұ޿��� ���Ͻÿ�
-- deptno = 30 �� �����߿��� �޿�(sal)�� �ִ�޿�, �ּұ޿��� ���Ͻÿ�
-- deptno = 31 �� �����߿��� �޿�(sal)�� �ִ�޿�, �ּұ޿��� ���Ͻÿ�
select max(sal), min(sal) from emp where deptno=10
union
select max(sal), min(sal) from emp where deptno=20
union
select max(sal), min(sal) from emp where deptno=21
union
select max(sal), min(sal) from emp where deptno=30
union
select max(sal), min(sal) from emp where deptno=31;

-- c.2 group by�� �̿��ϴ� ���
select max(sal), min(sal) from emp group by deptno;
select deptno, min(sal), max(sal) from emp group by deptno;




-- -----------------------------------
-- emp ���̺��� �ߺ����� �ʴ� ��å(job)�� �������� ����Ͻÿ�
-- 1. �����͸� ��å(job)�� �������� ������������ ���� �Ͻÿ�.
-- 2. ��å(job)�� �������� ����Ͻÿ�
-- -----------------------------------
select job, count(job) from emp group by job order by job asc;


-- -----------------------------------
-- ����. emp ���̺��� �μ���(deptno)�� �������� Ŀ�̼�(comm)�� �޴� �������� ����ϵ�
-- �����ȣ(deptno) ������������ �����Ͻÿ�.
-- 
-- ������ : �μ���ȣ, �μ���������, �μ���Ŀ�̼ǹ޴�������
-- -----------------------------------
select deptno, count(depno), count(comm) 
from emp 
group by deptno 
order by deptno asc;

-- @@@@@@@@@@@@@@
-- having ��
-- �׷��ε� �����Ϳ��� �˻��� �� ���
-- group by ���� �׻� ���� ���Ǿ�� ��. 
-- �ܵ� ��� �Ұ�
-- @@@@@@@@@@@@@@

-- -----------------------------------
-- �μ�(deptno)�� ��� �޿�(sal)�� �μ���ȣ(deptno) ����Ͻÿ�.
-- -----------------------------------
select avg(sal), deptno
from emp
group by deptno; 

-- -----------------------------------
-- �μ��� �޿� ����� 500�̻��� �μ� ��ȣ�� �޿� ��� ���Ͻÿ�.
-- 1. �μ����� �μ���ȣ�� �޿����( avg(sal) ) ���Ͽ� ����Ͻÿ�.
-- 2. �׷��ε� �����Ϳ��� �޿����( avg(sal) )�� 500�̻��� �����͸� ��˻�
-- -----------------------------------
select avg (sal), deptno
from emp
group by deptno
having avg(sal)>=500;



-- -----------------------------------
-- ����. 
-- �μ���ȣ(deptno)�� 10, 20, 30�� �μ��߿���              ==> where    �� ���.
-- �μ��� �μ���ȣ�� �޿�(sal)��� ����Ͻÿ�              ==> group by �� ���.
-- �μ��� �޿������ 500�̻��� �μ���ȣ�� �޿���� ���ϱ�  ==> having   �� ���.
-- ���� �����͸� �μ���ȣ ������������ �����Ͻÿ�.         ==> order by �� ���. 
-- 
-- �μ���ȣ(deptno)�� 10, 20, 30�� --> where
-- �μ���                          --> group by
-- �μ��� �޿������ 500�̻�       --> having
-- �μ���ȣ�� �޿�(sal)��� ���   --> select
-- 
-- deptno=20 �� ��µǸ� ����. 1��
-- -----------------------------------
select deptno, avg(sal)
from emp
where deptno in(10, 20, 30)
group by deptno
having avg(sal)>=500
order by deptno asc;


-- -----------------------------------
-- ���� 1: ���޺� �޿� �Ѿ� ���ϱ�
-- '���'�� �����ϰ� 
-- ����(job)�� 
-- �޿��Ѿ��� 1000 �̻��� ���� �߿���
-- �޿��Ѿװ� ������ ����Ͻÿ�.
-- ��, ��½� �޿��Ѿ� ������ �������� �����Ѵ�.
-- 
-- '���'�� ����              --> where
-- ����(job)��                --> group by
-- �޿� �Ѿ��� 1000 �̻�      --> having
-- �޿��Ѿ� ������ �����Ͻÿ� --> order by
-- -----------------------------------
select job, sum(sal)
from emp
where job !='���'
group by job
having sum(sal)>=1000
order by sum(sal) asc;


select deptno, avg(sal), count(deptno)
from emp
where deptno in(10,20,30)
group by deptno
having avg(sal)>=500
order by deptno asc;
-- -----------------------------------
-- ���� 2:  
-- ���� �ֱٿ� �Ի��� ������ �Ի��ϰ� �̸��� ���Ͻÿ�. "�߽ż� ���"
-- 2.1 oracle�� rowid�� rownum�� �䳻���� ���
-- 2.2 limit �� �̿��ϴ� ���
-- -----------------------------------
select max(hiredate) from emp;
select ename, hiredate from emp where hiredate in (select max(hiredate) from emp);

-- -----------------------------------
-- ���� 3:  
-- �ֱٿ� �Ի��� ���� 10���� �Ի��ϰ� �̸��� ���Ͻÿ�
-- 3.1 oracle�� rowid�� rownum�� �䳻���� ���
-- 3.2 top�̳� limit�� �̿��ϴ� ���
-- -----------------------------------
select rownum, ename, hiredate from emp;
select rownum, ename, hiredate from emp order by hiredate desc;

select * from ���̺��;
select rownum, ename, hiredate
  from ( select rownum, ename, hiredate from emp order by hiredate desc)
  where rownum <= 10;
-- @@@@@@@@@@@@@@
-- �̼�
-- @@@@@@@@@@@@@@

-- �̼� 1. �޿� �ְ��, ������, �Ѿ� �� ����� ����Ͻÿ�
select max(sal), min(sal), sum(sal), avg(sal)
from emp;

-- �̼� 2. ��� ����(job)���� �޿� �ְ��, ������, �Ѿ� �� ��� �޿� ����Ͻÿ�.
select job, max(sal), min(sal), sum(sal), avg(sal)
from emp;

-- �̼� 3. ��� ����(job)�� �������� ����ϱ�.

-- �̼� 4. ������ ���� ����Ͻÿ�.

-- �̼� 5. ���޺� �޿� �Ѿ��� ���Ͻÿ�.
--         a. ������ �����ϴ� ������ �ۼ�
--         b. ������ �����ϰ� ���޺� �޿� �Ѿ�(sum) ���ϱ�
--         c. ������ �����ϰ� ���޺� �޿� �Ѿ��� 1000 �̻���  �����͸� ���.

-- �̼� 6. �޿� �ְ��, �޿� �������� ���� ����Ͻÿ�.
select max(sal)-min(sal) 
from emp;



-- �̼� 7. ���޺� ������ ���� �޿� ����Ͻÿ�.

-- �̼� 8. �μ����� �μ���ȣ, ������, ��� �޿� ����Ͻÿ�.

