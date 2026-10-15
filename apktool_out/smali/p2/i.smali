.class public final Lp2/i;
.super Lt2/c;
.source "SourceFile"


# static fields
.field public static final p:Lp2/h;

.field public static final q:Lm2/u;


# instance fields
.field public final m:Ljava/util/ArrayList;

.field public n:Ljava/lang/String;

.field public o:Lm2/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp2/h;

    invoke-direct {v0}, Lp2/h;-><init>()V

    sput-object v0, Lp2/i;->p:Lp2/h;

    new-instance v0, Lm2/u;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Lm2/u;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp2/i;->q:Lm2/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lp2/i;->p:Lp2/h;

    invoke-direct {p0, v0}, Lt2/c;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    sget-object v0, Lm2/s;->b:Lm2/s;

    iput-object v0, p0, Lp2/i;->o:Lm2/q;

    return-void
.end method


# virtual methods
.method public final C(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_2

    iget-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lp2/i;->n:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp2/i;->P()Lm2/q;

    move-result-object v0

    instance-of v0, v0, Lm2/t;

    if-eqz v0, :cond_0

    iput-object p1, p0, Lp2/i;->n:Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "name == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final G()Lt2/c;
    .locals 1

    sget-object v0, Lm2/s;->b:Lm2/s;

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    return-object p0
.end method

.method public final J(J)V
    .locals 1

    new-instance v0, Lm2/u;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Lm2/u;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    return-void
.end method

.method public final K(Ljava/lang/Boolean;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lm2/s;->b:Lm2/s;

    invoke-virtual {p0, p1}, Lp2/i;->Q(Lm2/q;)V

    return-void

    :cond_0
    new-instance v0, Lm2/u;

    invoke-direct {v0, p1}, Lm2/u;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    return-void
.end method

.method public final L(Ljava/lang/Number;)V
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Lm2/s;->b:Lm2/s;

    invoke-virtual {p0, p1}, Lp2/i;->Q(Lm2/q;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lt2/c;->g:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    new-instance v0, Lm2/u;

    invoke-direct {v0, p1}, Lm2/u;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    return-void
.end method

.method public final M(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lm2/s;->b:Lm2/s;

    invoke-virtual {p0, p1}, Lp2/i;->Q(Lm2/q;)V

    return-void

    :cond_0
    new-instance v0, Lm2/u;

    invoke-direct {v0, p1}, Lm2/u;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    return-void
.end method

.method public final N(Z)V
    .locals 1

    new-instance v0, Lm2/u;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Lm2/u;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    return-void
.end method

.method public final P()Lm2/q;
    .locals 2

    iget-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm2/q;

    return-object v0
.end method

.method public final Q(Lm2/q;)V
    .locals 2

    iget-object v0, p0, Lp2/i;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lm2/s;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lt2/c;->j:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lp2/i;->P()Lm2/q;

    move-result-object v0

    check-cast v0, Lm2/t;

    iget-object v1, p0, Lp2/i;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lm2/t;->b:Lo2/m;

    invoke-virtual {v0, v1, p1}, Lo2/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lp2/i;->n:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lp2/i;->o:Lm2/q;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lp2/i;->P()Lm2/q;

    move-result-object v0

    instance-of v1, v0, Lm2/o;

    if-eqz v1, :cond_4

    check-cast v0, Lm2/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lm2/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lp2/i;->q:Lm2/u;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()V
    .locals 2

    new-instance v0, Lm2/o;

    invoke-direct {v0}, Lm2/o;-><init>()V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    iget-object v1, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final h()V
    .locals 2

    new-instance v0, Lm2/t;

    invoke-direct {v0}, Lm2/t;-><init>()V

    invoke-virtual {p0, v0}, Lp2/i;->Q(Lm2/q;)V

    iget-object v1, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final x()V
    .locals 2

    iget-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lp2/i;->n:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lp2/i;->P()Lm2/q;

    move-result-object v1

    instance-of v1, v1, Lm2/o;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final z()V
    .locals 2

    iget-object v0, p0, Lp2/i;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lp2/i;->n:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lp2/i;->P()Lm2/q;

    move-result-object v1

    instance-of v1, v1, Lm2/t;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
