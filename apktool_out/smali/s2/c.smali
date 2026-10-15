.class public final Ls2/c;
.super Lm2/b0;
.source "SourceFile"


# static fields
.field public static final b:Lcom/auth0/android/request/internal/i;


# instance fields
.field public final a:Lm2/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/auth0/android/request/internal/i;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lcom/auth0/android/request/internal/i;-><init>(I)V

    sput-object v0, Ls2/c;->b:Lcom/auth0/android/request/internal/i;

    return-void
.end method

.method public constructor <init>(Lm2/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls2/c;->a:Lm2/b0;

    return-void
.end method


# virtual methods
.method public final b(Lt2/b;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ls2/c;->a:Lm2/b0;

    invoke-virtual {v0, p1}, Lm2/b0;->b(Lt2/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c(Lt2/c;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/sql/Timestamp;

    iget-object v0, p0, Ls2/c;->a:Lm2/b0;

    invoke-virtual {v0, p1, p2}, Lm2/b0;->c(Lt2/c;Ljava/lang/Object;)V

    return-void
.end method
