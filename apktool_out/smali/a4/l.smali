.class public final La4/l;
.super Lw3/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:La4/t;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;La4/t;II)V
    .locals 0

    iput-object p2, p0, La4/l;->e:La4/t;

    iput p3, p0, La4/l;->f:I

    iput p4, p0, La4/l;->g:I

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lw3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget v0, p0, La4/l;->f:I

    iget v1, p0, La4/l;->g:I

    iget-object v2, p0, La4/l;->e:La4/t;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v3, v2, La4/t;->z:La4/c0;

    const/4 v4, 0x1

    invoke-virtual {v3, v0, v1, v4}, La4/c0;->x(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v2, v0}, La4/t;->e(Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
