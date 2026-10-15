.class public final La4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Lw3/f;

.field public c:Ljava/net/Socket;

.field public d:Ljava/lang/String;

.field public e:Lf4/i;

.field public f:Lf4/h;

.field public g:La4/j;

.field public final h:La4/e0;

.field public i:I


# direct methods
.method public constructor <init>(Lw3/f;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La4/h;->a:Z

    iput-object p1, p0, La4/h;->b:Lw3/f;

    sget-object p1, La4/j;->a:La4/i;

    iput-object p1, p0, La4/h;->g:La4/j;

    sget-object p1, La4/f0;->a:La4/e0;

    iput-object p1, p0, La4/h;->h:La4/e0;

    return-void
.end method
