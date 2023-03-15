DESCRIPTION = ""Log::Any" provides a standard log production API for modules. \
Log::Any::Adapter allows applications to choose the mechanism for log \
consumption, whether screen, file or another logging mechanism like \
Log::Dispatch or Log::Log4perl."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PR/PREACTION/Log-Any-1.710.tar.gz"

SRC_URI[md5sum] = "f0a9c5b9b81cc5fb842298d9b4b11779"
SRC_URI[sha256sum] = "bdb65fd0a8888fd4522f39f0fe95e94cb9267ef1fd9f7737564d46527b306f6f"

S = "${WORKDIR}/Log-Any-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
