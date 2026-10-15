.class public abstract Lk3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/a;
.implements Ljava/io/Serializable;


# instance fields
.field public transient b:Lo3/a;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Class;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lk3/a;->d:Ljava/lang/Class;

    iput-object p3, p0, Lk3/a;->e:Ljava/lang/String;

    iput-object p4, p0, Lk3/a;->f:Ljava/lang/String;

    iput-boolean p5, p0, Lk3/a;->g:Z

    return-void
.end method


# virtual methods
.method public final b()Lk3/b;
    .locals 2

    iget-object v0, p0, Lk3/a;->d:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    iget-boolean v1, p0, Lk3/a;->g:Z

    if-eqz v1, :cond_1

    sget-object v1, Lk3/n;->a:Lk3/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lk3/h;

    invoke-direct {v1, v0}, Lk3/h;-><init>(Ljava/lang/Class;)V

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_1
    sget-object v1, Lk3/n;->a:Lk3/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lk3/c;

    invoke-direct {v1, v0}, Lk3/c;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :goto_1
    return-object v0
.end method
