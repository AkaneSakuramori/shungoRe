.class public Lc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Lj0/r;

    .line 12
    invoke-direct {v0, p0}, Lj0/p;-><init>(Lc/a;)V

    iput-object v0, p0, Lc/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    .line 2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v0, "timeUnit"

    .line 3
    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lx3/m;

    .line 5
    sget-object v1, Lw3/f;->i:Lw3/f;

    .line 6
    invoke-direct {v0, v1, p1}, Lx3/m;-><init>(Lw3/f;Ljava/util/concurrent/TimeUnit;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/a;->a:Ljava/lang/Object;

    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lc/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lc/a;->a:Ljava/lang/Object;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lj0/o;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Lm2/q;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lc/a;->a:Ljava/lang/Object;

    check-cast v0, Lp2/s;

    iget-object v0, v0, Lp2/s;->b:Lm2/m;

    invoke-virtual {v0, p1, p2}, Lm2/m;->b(Lm2/q;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(I)Lj0/o;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public d(IILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
