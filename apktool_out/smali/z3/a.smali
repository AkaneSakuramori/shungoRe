.class public final Lz3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf4/i;

.field public b:J


# direct methods
.method public constructor <init>(Lf4/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/a;->a:Lf4/i;

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Lz3/a;->b:J

    return-void
.end method


# virtual methods
.method public final a()Lt3/q;
    .locals 8

    new-instance v0, Lt3/p;

    invoke-direct {v0}, Lt3/p;-><init>()V

    :goto_0
    iget-object v1, p0, Lz3/a;->a:Lf4/i;

    iget-wide v2, p0, Lz3/a;->b:J

    invoke-interface {v1, v2, v3}, Lf4/i;->n(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p0, Lz3/a;->b:J

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lz3/a;->b:J

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lt3/p;->b()Lt3/q;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v2, 0x4

    const/16 v3, 0x3a

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v1, v3, v4, v5, v2}, Lq3/l;->Y2(Ljava/lang/CharSequence;CIZI)I

    move-result v2

    const/4 v6, -0x1

    const-string v7, "this as java.lang.String).substring(startIndex)"

    if-eq v2, v6, :cond_1

    invoke-virtual {v1, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v3, v4}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v1}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const-string v5, ""

    if-ne v2, v3, :cond_2

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v5, v1}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v5, v1}, Lt3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
