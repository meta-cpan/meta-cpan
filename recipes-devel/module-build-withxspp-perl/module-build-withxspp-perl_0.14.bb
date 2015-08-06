DESCRIPTION = "This subclass of Module::Build adds some tools and processes to make it \
easier to use for wrapping C++ using XS++ (ExtUtils::XSpp)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Module-Build-WithXSpp"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SM/SMUELLER/Module-Build-WithXSpp-0.14.tar.gz"

SRC_URI[md5sum] = "f3d6ad08127f62eed9baef131870f450"
SRC_URI[sha256sum] = "53b3c8c8fdbd50fc3dad3d19da20f1b6414ef70665b9311710c802969e746934"
RDEPENDS_${PN} += "extutils-cppguess-perl"
RDEPENDS_${PN} += "extutils-xspp-perl"
RDEPENDS_${PN} += "module-build-perl"

S = "${WORKDIR}/Module-Build-WithXSpp-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
