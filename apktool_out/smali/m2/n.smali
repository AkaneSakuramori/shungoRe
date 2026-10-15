.class public final Lm2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lo2/f;

.field public final b:I

.field public final c:Lm2/a;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:Lm2/v;

.field public final l:Lm2/w;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lo2/f;->d:Lo2/f;

    iput-object v0, p0, Lm2/n;->a:Lo2/f;

    const/4 v0, 0x1

    iput v0, p0, Lm2/n;->b:I

    sget-object v1, Lm2/g;->b:Lm2/a;

    iput-object v1, p0, Lm2/n;->c:Lm2/a;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lm2/n;->d:Ljava/util/HashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm2/n;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lm2/n;->f:Ljava/util/ArrayList;

    const/4 v1, 0x2

    iput v1, p0, Lm2/n;->h:I

    iput v1, p0, Lm2/n;->i:I

    iput-boolean v0, p0, Lm2/n;->j:Z

    sget-object v0, Lm2/z;->b:Lm2/v;

    iput-object v0, p0, Lm2/n;->k:Lm2/v;

    sget-object v0, Lm2/z;->c:Lm2/w;

    iput-object v0, p0, Lm2/n;->l:Lm2/w;

    return-void
.end method


# virtual methods
.method public final a(Lm2/p;Ljava/lang/reflect/Type;)V
    .locals 4

    iget-object v0, p0, Lm2/n;->e:Ljava/util/ArrayList;

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    move-result-object v3

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Lp2/r;

    invoke-direct {v3, p1, v1, v2}, Lp2/r;-><init>(Lm2/p;Lcom/google/gson/reflect/TypeToken;Z)V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    instance-of v1, p1, Lm2/b0;

    if-eqz v1, :cond_1

    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    move-result-object p2

    check-cast p1, Lm2/b0;

    sget-object v1, Lp2/x;->a:Lp2/u;

    new-instance v1, Lp2/u;

    const/4 v2, 0x2

    invoke-direct {v1, p2, p1, v2}, Lp2/u;-><init>(Ljava/lang/Object;Lm2/b0;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
