DESCRIPTION = "produce tied (and other) separate but combined variables"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-TieCombine"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/IO-TieCombine-1.005.tar.gz"

SRC_URI[md5sum] = "9538a96407b32d697a4244959a9f0a7a"
SRC_URI[sha256sum] = "402d4db8300b3d271632f4995e0ade329d89280a7e47f2badf8b38af6e5569af"

S = "${WORKDIR}/IO-TieCombine-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
