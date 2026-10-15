.class public final Lm2/t;
.super Lm2/q;
.source "SourceFile"


# instance fields
.field public final b:Lo2/m;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo2/m;

    invoke-direct {v0}, Lo2/m;-><init>()V

    iput-object v0, p0, Lm2/t;->b:Lo2/m;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lm2/q;
    .locals 1

    iget-object v0, p0, Lm2/t;->b:Lo2/m;

    invoke-virtual {v0, p1}, Lo2/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm2/q;

    return-object p1
.end method

.method public final c(Ljava/lang/String;)Lm2/q;
    .locals 1

    iget-object v0, p0, Lm2/t;->b:Lo2/m;

    invoke-virtual {v0, p1}, Lo2/m;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm2/q;

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Lm2/t;

    if-eqz v0, :cond_0

    check-cast p1, Lm2/t;

    iget-object p1, p1, Lm2/t;->b:Lo2/m;

    iget-object v0, p0, Lm2/t;->b:Lo2/m;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lm2/t;->b:Lo2/m;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
