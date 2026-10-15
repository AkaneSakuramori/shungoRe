.class public final Lp2/n;
.super Lm2/b0;
.source "SourceFile"


# static fields
.field public static final c:Lp2/l;


# instance fields
.field public final a:Lm2/m;

.field public final b:Lm2/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lm2/z;->b:Lm2/v;

    new-instance v1, Lp2/l;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Lp2/l;-><init>(ILjava/lang/Object;)V

    sput-object v1, Lp2/n;->c:Lp2/l;

    return-void
.end method

.method public constructor <init>(Lm2/m;Lm2/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/n;->a:Lm2/m;

    iput-object p2, p0, Lp2/n;->b:Lm2/a0;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lt2/b;->T()I

    move-result v0

    invoke-static {v0}, Lp/h;->a(I)I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lt2/b;->P()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lt2/b;->J()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v0, p0, Lp2/n;->b:Lm2/a0;

    invoke-interface {v0, p1}, Lm2/a0;->a(Lt2/b;)Ljava/lang/Number;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lt2/b;->R()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance v0, Lo2/m;

    invoke-direct {v0}, Lo2/m;-><init>()V

    invoke-virtual {p1}, Lt2/b;->e()V

    :goto_0
    invoke-virtual {p1}, Lt2/b;->G()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lt2/b;->N()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lp2/n;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo2/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lt2/b;->z()V

    return-object v0

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lt2/b;->a()V

    :goto_1
    invoke-virtual {p1}, Lt2/b;->G()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1}, Lp2/n;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lt2/b;->x()V

    return-object v0
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lt2/c;->G()Lt2/c;

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lp2/n;->a:Lm2/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v0

    invoke-virtual {v1, v0}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v0

    instance-of v1, v0, Lp2/n;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lt2/c;->h()V

    invoke-virtual {p1}, Lt2/c;->z()V

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V

    return-void
.end method
