DESCRIPTION = "Cookie::Baker::XS provides cookie string parser that implemented by XS. \
This modules only provides parser, does not have a generator function."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Cookie-Baker-XS"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/K/KA/KAZEBURO/Cookie-Baker-XS-0.10.tar.gz"

SRC_URI[md5sum] = "3254f7d98a7cabac4ee9680474058b45"
SRC_URI[sha256sum] = "82dbcad202ab4dfac42310dc4e2f451d26e093b5db7dbd6fa5bd805fd1084ba3"

S = "${WORKDIR}/Cookie-Baker-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
