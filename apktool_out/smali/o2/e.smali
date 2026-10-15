.class public final Lo2/e;
.super Lm2/b0;
.source "SourceFile"


# instance fields
.field public a:Lm2/b0;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lm2/m;

.field public final synthetic e:Lcom/google/gson/reflect/TypeToken;

.field public final synthetic f:Lo2/f;


# direct methods
.method public constructor <init>(Lo2/f;ZZLm2/m;Lcom/google/gson/reflect/TypeToken;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/e;->f:Lo2/f;

    iput-boolean p2, p0, Lo2/e;->b:Z

    iput-boolean p3, p0, Lo2/e;->c:Z

    iput-object p4, p0, Lo2/e;->d:Lm2/m;

    iput-object p5, p0, Lo2/e;->e:Lcom/google/gson/reflect/TypeToken;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lo2/e;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lt2/b;->Y()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lo2/e;->a:Lm2/b0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo2/e;->e:Lcom/google/gson/reflect/TypeToken;

    iget-object v1, p0, Lo2/e;->d:Lm2/m;

    iget-object v2, p0, Lo2/e;->f:Lo2/f;

    invoke-virtual {v1, v2, v0}, Lm2/m;->d(Lm2/c0;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v0

    iput-object v0, p0, Lo2/e;->a:Lm2/b0;

    :goto_0
    invoke-virtual {v0, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 3

    iget-boolean v0, p0, Lo2/e;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lt2/c;->G()Lt2/c;

    return-void

    :cond_0
    iget-object v0, p0, Lo2/e;->a:Lm2/b0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lo2/e;->e:Lcom/google/gson/reflect/TypeToken;

    iget-object v1, p0, Lo2/e;->d:Lm2/m;

    iget-object v2, p0, Lo2/e;->f:Lo2/f;

    invoke-virtual {v1, v2, v0}, Lm2/m;->d(Lm2/c0;Lcom/google/gson/reflect/TypeToken;)Lm2/b0;

    move-result-object v0

    iput-object v0, p0, Lo2/e;->a:Lm2/b0;

    :goto_0
    invoke-virtual {v0, p1, p2}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V

    return-void
.end method
