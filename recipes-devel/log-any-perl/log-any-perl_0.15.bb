DESCRIPTION = ""Log::Any\" allows CPAN modules to safely and efficiently log messages, \
while letting the application choose (or decline to choose) a logging \
mechanism \
such as \"Log::Dispatch\" or \"Log::Log4perl\"."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Any"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/J/JS/JSWARTZ/Log-Any-0.15.tar.gz"

SRC_URI[md5sum] = "8337dd1dedd499de70f941ef980b5fe9"
SRC_URI[sha256sum] = "fbb24743d1b61debc490cb41f8f3f1e865379c8b52dacb419f10ff03d02b1cb2"

S = "${WORKDIR}/Log-Any-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
