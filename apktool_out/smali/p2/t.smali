.class public final Lp2/t;
.super Lm2/b0;
.source "SourceFile"


# instance fields
.field public final a:Lm2/m;

.field public final b:Lm2/b0;

.field public final c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lm2/m;Lm2/b0;Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp2/t;->a:Lm2/m;

    iput-object p2, p0, Lp2/t;->b:Lm2/b0;

    iput-object p3, p0, Lp2/t;->c:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp2/t;->b:Lm2/b0;

    invoke-virtual {v0, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lp2/t;->c:Ljava/lang/reflect/Type;

    if-eqz p2, :cond_1

    const-class v1, Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    instance-of v1, v0, Ljava/lang/reflect/TypeVariable;

    if-nez v1, :cond_0

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    iget-object v2, p0, Lp2/t;->b:Lm2/b0;

    if-eq v1, v0, :cond_4

    iget-object v0, p0, Lp2/t;->a:Lm2/m;

    invoke-static {v1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {v0, v1}, Lm2/m;->c(Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v0

    instance-of v1, v0, Lp2/p;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    instance-of v1, v2, Lp2/p;

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v2, v0

    :cond_4
    :goto_2
    invoke-virtual {v2, p1, p2}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V

    return-void
.end method
